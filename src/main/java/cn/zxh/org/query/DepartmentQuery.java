package cn.zxh.org.query;

/**
 * @ClassName DepartmentQuery
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 13:58
 * @Version 1.0
 */
public class DepartmentQuery extends BasicpageQuery{
    private Long id;
    private String name;

    public DepartmentQuery() {
    }

    public DepartmentQuery(Integer currentPage, Integer pageSize, Long id, String name) {
        super(currentPage, pageSize);
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
