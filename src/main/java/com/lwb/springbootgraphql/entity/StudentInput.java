package com.lwb.springbootgraphql.entity;

public class StudentInput {

    private String name;
    private String className;
    private String section;
    private String cTName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getcTName() {
        return cTName;
    }

    public void setcTName(String cTName) {
        this.cTName = cTName;
    }
}
