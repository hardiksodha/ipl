package org.ipl.fun.model;

import javax.persistence.*;

/**
 * Created by Hardik on 28-01-2017.
 */
@Entity
public class Prediction
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long predictionId;

    @ManyToOne(fetch = FetchType.LAZY)
    private User people;

    @ManyToOne(fetch = FetchType.LAZY)
    private Schedule schedule;

    private String prediction;

    private long team1Score;

    private long team2Score;

    private long totalSix;

    private long totalWicket;

    public long getPredictionId() {
        return predictionId;
    }

    public void setPredictionId(long predictionId) {
        this.predictionId = predictionId;
    }

    public User getPeople() {
        return people;
    }

    public void setPeople(User people) {
        this.people = people;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public long getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(long team1Score) {
        this.team1Score = team1Score;
    }

    public long getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(long team2Score) {
        this.team2Score = team2Score;
    }

    public long getTotalSix() {
        return totalSix;
    }

    public void setTotalSix(long totalSix) {
        this.totalSix = totalSix;
    }

    public long getTotalWicket() {
        return totalWicket;
    }

    public void setTotalWicket(long totalWicket) {
        this.totalWicket = totalWicket;
    }
}
