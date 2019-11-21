package com.qf.j1906.common.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JdUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private String upassword;

    private String uphone;

    private String uname;

    private String uemail;

    private Integer rid;

    private String usex;

    private String uidcard;

    private List<JdPermission> permission;

    private List<JdRole> roles;

    private List<JdOrder> orders;

    private List<JdRoom> rooms;

    private List<JdState> states;

}
