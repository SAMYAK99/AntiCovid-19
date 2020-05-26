package com.projects.anticovid_19.MythBusters;

public class MythBusterModel {
    public String title, content;



    public MythBusterModel(String title, String content) {
        this.title = title;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}

