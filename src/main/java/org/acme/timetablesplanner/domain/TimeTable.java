package org.acme.timetablesplanner.domain;

import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.ProblemFactProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.solver.SolverStatus;

@PlanningSolution
public class TimeTable {

    @ProblemFactProperty
    @ValueRangeProvider(id = "timeslotRange")
    private List<Timeslot> timeslotList;
    @ProblemFactProperty
    @ValueRangeProvider(id = "roomRange")
    private List<Room> roomList;
    @PlanningEntityCollectionProperty
    private List<Lesson> lessonList;

    @PlanningScore
    private HardSoftScore score;

    // Ignored by OptaPlanner, used by the UI to display solve or stop solving button
    private SolverStatus solverStatus;

    public TimeTable() {
    }

    public TimeTable(List<Timeslot> timeslotList, List<Room> roomList, List<Lesson> lessonList) {
        this.timeslotList = timeslotList;
        this.roomList = roomList;
        this.lessonList = lessonList;
    }

    public List<Timeslot> getTimeslotList() {
        return timeslotList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public HardSoftScore getScore() {
        return score;
    }

    public SolverStatus getSolverStatus() {
        return solverStatus;
    }

    public void setTimeslotList(List<Timeslot> timeslotList) {
        this.timeslotList = timeslotList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void setScore(HardSoftScore score) {
        this.score = score;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public void setSolverStatus(SolverStatus solverStatus) {
        this.solverStatus = solverStatus;
    }

}