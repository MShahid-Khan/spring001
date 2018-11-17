/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med.objava.spring.dao.template;

import java.util.List;
import javax.sql.DataSource;
import med.objava.spring.dao.MedHistoryDao;
import med.objava.spring.dao.mapper.MedHistoryRowMapper;
import med.objava.spring.model.MedHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author shahzad
 */
public class MedHistoryJdbcTemplate implements MedHistoryDao {

    @Autowired
    private DataSource dataSource;
    
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Integer userid, Integer dockerid, Integer calid, String notes, Integer followup_days) {
        // Create
        String sql = "INSERT INTO medical_history ( userid, dockerid, calid, notes, followup_days ) value (?,?,?,?,?)";
        jdbcTemplateObject.update(sql, userid, dockerid, calid, notes, followup_days);
    }

    @Override
    public MedHistory getUserHist(Integer userid) {
        String sql = query + "WHERE userid=?";
        MedHistory user = jdbcTemplateObject
                .queryForObject(
                        sql,
                        new Object[]{userid},
                        new MedHistoryRowMapper());
        return user;
    }

    @Override
    public MedHistory getDocHist(Integer dockerid) {
        String sql = query + "WHERE dockerid=?";
        MedHistory user = jdbcTemplateObject
                .queryForObject(
                        sql,
                        new Object[]{dockerid},
                        new MedHistoryRowMapper());
        return user;
    }

    @Override
    public MedHistory getDayHist(Integer calid) {
        String sql = query + "WHERE calid=?";
        MedHistory user = jdbcTemplateObject
                .queryForObject(
                        sql,
                        new Object[]{calid},
                        new MedHistoryRowMapper());
        return user;
    }

    @Override
    public List<MedHistory> all() {
        List<MedHistory> list = jdbcTemplateObject
                .query(query, new MedHistoryRowMapper());
        return list;
    }

    @Override
    public void delete(Integer historyid) {
        String sql = "DELETE FROM medical_history "
                + "WHERE historyid=?";
        jdbcTemplateObject.update(sql,
                new Object[]{historyid});
    }

    @Override
    public void update(Integer historyid, Integer userid, Integer dockerid, Integer calid, String notes, Integer followup_days) {
        String sql = "UPDATE medical_history "
                + "SET "
                + " userid=?, dockerid=?, calid=?, notes=?, followup_days=? "
                + "WHERE historyid=?";
        jdbcTemplateObject.update(sql,
                new Object[]{userid, dockerid, calid, notes, followup_days, historyid});
    }

}
