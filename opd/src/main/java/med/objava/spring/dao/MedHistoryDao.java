/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med.objava.spring.dao;

import java.util.List;
import javax.sql.DataSource;
import med.objava.spring.model.MedHistory;

/**
 *
 * @author shahzad
 */
public interface MedHistoryDao {
    
    public String query = "SELECT historyid, userid, dockerid, calid, notes, followup_days FROM medical_history " ;

    public void setDataSource(DataSource ds);

    public void create(Integer userid, Integer dockerid, Integer calid, String notes, Integer followup_days);

    public MedHistory getUserHist(Integer userid);

    public MedHistory getDocHist(Integer docid);

    public MedHistory getDayHist(Integer calid);

    public List<MedHistory> all();

    public void delete(Integer historyid);

    public void update(Integer historyid, Integer userid, Integer dockerid, Integer calid, String notes, Integer followup_days);

}
