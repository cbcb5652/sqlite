package com.cbcb.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Author 晨边#CB
 * @Date:created in  2019/11/20 16:06
 * @Version V1.0
 **/

public class ReqBody {

    /*
    分支名
     */
    private String Name;

    private String Email;

    public String getName() {
        return Name;
    }

    @JsonProperty(value = "Name")
    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    @JsonProperty(value = "Email")
    public void setEmail(String email) {
        Email = email;
    }
}
