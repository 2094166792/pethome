package cn.zxh.org.query;

/**
 * @ClassName BasicpageQuery
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 12:05
 * @Version 1.0
 */
public class BasicpageQuery {
    private Integer currentPage;
    private Integer pageSize;

    public BasicpageQuery() {
        this.currentPage = 1;
        this.pageSize = 5;
    }

    public BasicpageQuery(Integer currentPage, Integer pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public Integer getBegin(){
        return (this.currentPage - 1) * this.pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
