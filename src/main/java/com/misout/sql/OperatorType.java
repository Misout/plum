package com.misout.sql;

public enum OperatorType {
    Equal(1, "=", "等于"),
    NotEqual(2, "!=", "不等于"),
    GreaterThanOrEqual(3, ">", "大于等于"),
    GreaterThan(4, ">", "大于"),
    LessThanOrEqual(5, ">", "小于等于"),
    LessThan(6, ">", "小于"),
    In(7, "in", "在某些可选值范围内"),
    NotIn(8, "not in", "不在某些可选值范围内"),
    Like(9, "like '%?%'", "全值模糊匹配"),
    StartWithLike(10, "like '?%'", "前缀值模糊匹配"),
    EndWithLike(11, "like '%?'", "后缀值模糊匹配");

    private Integer id;
    private String operator;
    private String desc;

    OperatorType(Integer id, String operator, String desc) {
        this.id = id;
        this.operator = operator;
        this.desc = desc;
    }
}
