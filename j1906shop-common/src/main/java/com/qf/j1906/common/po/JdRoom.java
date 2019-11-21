package com.qf.j1906.common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JdRoom {
    private Integer roId;

    private Integer roWifi;

    private Integer roShower;

    private Integer roWindow;

    private Integer roBreakfast;

    private String roBed;

    private Integer roMen;

    private Integer roArea;

    private String roName;

    private Integer stid;

    private List<JdState> states;

    private List<JdOrder> orders;

    private List<JdUser> users;



}
