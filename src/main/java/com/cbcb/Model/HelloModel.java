package com.cbcb.Model;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/11/19 16:04
 * @Version V1.0
 **/

public class HelloModel {
    private long Id;

    private String Title;

    private String Text;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
