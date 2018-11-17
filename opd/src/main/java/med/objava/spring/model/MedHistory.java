/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package med.objava.spring.model;

/**
 *
 * @author Shahid
 */
public class MedHistory {

    private Integer historyid;
    private Integer userid;
    private Integer dockerid;
    private Integer calid;
    private String notes;
    private Integer followup_days;

    public Integer getHistoryID() {
        return historyid;
    }

    public void setHistoryID(Integer historyid) {
        this.historyid = historyid;
    }

    public Integer getUserID() {
        return userid;
    }

    public void setUserID(Integer userid) {
        this.userid = userid;
    }

    public Integer getDockerID() {
        return dockerid;
    }

    public void setDockerID(Integer dockerid) {
        this.dockerid = dockerid;
    }

    public Integer getCalID() {
        return calid;
    }

    public void setCalID(Integer calid) {
        this.calid = calid;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getFollowupDays() {
        return followup_days;
    }

    public void setFollowupDays(Integer followup_days) {
        this.followup_days = followup_days;
    }

}
