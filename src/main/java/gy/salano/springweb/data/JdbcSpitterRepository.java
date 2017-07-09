/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gy.salano.springweb.data;

import gy.salano.springweb.confg.DataSourceConfiguration;
import gy.salano.springweb.libs.Spitter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author salano
 */
@Primary
@Repository
//@Qualifier("JdbcSpitterRepository")
public class JdbcSpitterRepository implements SpitterRepository {

    private static final String INSERT_SPITTER = "insert into Spitter (username, password, fullname, email, updateByEmail) values (?, ?, ?, ?, ?)";
    private static final String SELECT_SPITTER = "select id, username, password, fullname, email, updateByEmail from Spitter";

    private JdbcTemplate jdbcTemplate;
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    

    @Override
    public Spitter save(Spitter spitter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spitter findByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Inserts a spitter using a simple JdbcTemplate update() call. Does not
     * return the ID of the newly created Spitter.
     *
     * @param spitter a Spitter to insert into the database
     */
    @SuppressWarnings("unused")
    private void insertSpitter(Spitter spitter) {
        jdbcTemplate.update(INSERT_SPITTER,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail(),
                spitter.getEmail());
    }

    private static final class SpitterRowMapper implements RowMapper<Spitter> {

        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String fullName = rs.getString("fullname");
            String email = rs.getString("email");
            boolean updateByEmail = rs.getBoolean("updateByEmail");
            return new Spitter(id, username, password, fullName, email, updateByEmail);
        }
    }

    public Spitter findOne(long id) {
        return jdbcTemplate.queryForObject(
                SELECT_SPITTER + " where id=?", new SpitterRowMapper(), id);
    }

}
