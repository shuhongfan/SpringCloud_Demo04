package com.shf.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)  // 链式写法
public class Dept implements Serializable {  // 序列化
//    Dept实体类, orm 类表关系映射
    private Long deptno;
    private String dname;

//    这个数据库存在呢个个数据库的字段 ~ 微服务,一个服务对于一个数据库,同一个信息可能存在不同的数据库中
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }

    /**
     * 链式写法
     * Dapt dept = new Dapt();
     * dept.setDeptNo(11).setDname("sss").setDbScource('001')
     */
}
