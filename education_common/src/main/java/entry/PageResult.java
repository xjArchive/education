package entry;

import java.util.List;

/**
 *
 * 分页结果类
 * @param <T>
 */
public class PageResult <T>{

    private  long total;  //页数
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
