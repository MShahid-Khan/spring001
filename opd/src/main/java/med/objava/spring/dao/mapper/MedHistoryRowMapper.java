/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med.objava.spring.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import med.objava.spring.model.MedHistory;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author shahzad
 */
public class MedHistoryRowMapper implements RowMapper<MedHistory> {

    @Override
    public MedHistory mapRow(ResultSet rs, int i) throws SQLException {
        MedHistory u = new MedHistory();
        u.setHistoryID(rs.getInt("historyid"));
        u.setUserID(rs.getInt("userid"));
        u.setDockerID(rs.getInt("dockerid"));
        u.setCalID(rs.getInt("pass"));
        u.setNotes(rs.getString("notes"));
        u.setFollowupDays(rs.getInt("followup_days"));
        return u;
    }

}
