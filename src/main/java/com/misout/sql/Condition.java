package com.misout.sql;

public class Condition<T> {

    /** 列名 */
    private String columnName;

    /** 操作类型 */
    private OperatorType operaterType;

    /** 值 */
    private T value;

    public Condition(String columnName, OperatorType operaterType, T value) {
        this.columnName = columnName;
        this.operaterType = operaterType;
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public OperatorType getOperaterType() {
        return operaterType;
    }

    public void setOperaterType(OperatorType operaterType) {
        this.operaterType = operaterType;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Condition{");
        sb.append("columnName='").append(columnName).append('\'');
        sb.append(", operaterType=").append(operaterType);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
