/**
 * @author Felix
 * @describe
 * @date 2020/6/29 19:19
 */
package felix.entity;

import java.util.Objects;

public class Ticket {
    private int id;
    private int uid;
    private int sid;
    private int row;
    private int column;

    public Ticket() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return sid == ticket.sid &&
                row == ticket.row &&
                column == ticket.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, row, column);
    }

    public Ticket(int uid, int sid, int row, int column) {
        this.uid = uid;
        this.sid = sid;
        this.row = row;
        this.column = column;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
