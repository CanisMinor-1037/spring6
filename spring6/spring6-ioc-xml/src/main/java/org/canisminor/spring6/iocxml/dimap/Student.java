package org.canisminor.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {
    private String sid;
    private String sname;

    private Map<String, Teacher> tMap;

    private List<Lesson> lessonList;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> gettMap() {
        return tMap;
    }

    public void settMap(Map<String, Teacher> tMap) {
        this.tMap = tMap;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", tMap=" + tMap +
                ", lessonList=" + lessonList +
                '}';
    }
}
