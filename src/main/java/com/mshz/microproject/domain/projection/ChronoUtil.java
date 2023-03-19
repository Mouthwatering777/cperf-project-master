package com.mshz.microproject.domain.projection;

import java.time.Instant;

import com.mshz.microproject.domain.enumeration.ProjectTaskStatus;

public class ChronoUtil {
    private Instant startDate;
    private Instant pausedDate;
    private Instant prviewFinishDate;
    private Instant finishDate;
    private ProjectTaskStatus status;
    private boolean execeed;

    public ChronoUtil() { }

    public ChronoUtil(Instant startDate,Instant pausedDate, Instant prviewFinishDate, Instant finishDate, ProjectTaskStatus status, boolean execeed) {
        this.startDate = startDate;
        this.prviewFinishDate = prviewFinishDate;
        this.finishDate = finishDate;
        this.status = status;
        this.execeed = execeed;
        this.pausedDate = pausedDate;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public Instant getPausedDate() {
        return pausedDate;
    }

    public void setPausedDate(Instant pausedDate) {
        this.pausedDate = pausedDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getPrviewFinishDate() {
        return prviewFinishDate;
    }

    public void setPrviewFinishDate(Instant prviewFinishDate) {
        this.prviewFinishDate = prviewFinishDate;
    }

    public Instant getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Instant finishDate) {
        this.finishDate = finishDate;
    }

    public ProjectTaskStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectTaskStatus status) {
        this.status = status;
    }

    public boolean isExeceed() {
        return execeed;
    }

    public void setExeceed(boolean execeed) {
        this.execeed = execeed;
    }
    
}
