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
public class JdRole {
    private Integer rid;
    private String rname;
    private List<JdUser> user;
}
