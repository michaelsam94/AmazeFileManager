package com.amaze.filemanager.database.models;


public class HiddenOperationData implements OperationData {
    private String path;

    public HiddenOperationData(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
