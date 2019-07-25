package chen.jnoro.community.community.pojo.dto;

import java.util.List;

/**
 * @Description: 分页的DTO
 * @Auther: jianrong.chen
 * @Date: 2019/7/5 16:23
 */
public class PageDTO {

    /**
     * 话题的列表
     */
    private List<QuestionDTO> questionDTOS;

    /**
     * 是否有向前按钮
     */
    private boolean showPrevious;

    /**
     * 是否有第一页按钮
     */
    private boolean showFirstPage;

    /**
     * 是否有下一页的按钮
     */
    private boolean showNext;

    /**
     * 是否有最后一页的按钮
     */
    private boolean showEndPage;

    /**
     * 当前页
     */
    private Integer page;

    /**
     * 当前的数组
     */
    private List<Integer> pages;

    /**
     * 获取
     *
     * @return questionDTOS
     */
    public List<QuestionDTO> getQuestionDTOS() {
        return this.questionDTOS;
    }

    /**
     * 设置
     *
     * @param questionDTOS
     */
    public void setQuestionDTOS(List<QuestionDTO> questionDTOS) {
        this.questionDTOS = questionDTOS;
    }

    /**
     * 获取 是否有向前按钮
     *
     * @return showPrevious 是否有向前按钮
     */
    public boolean showPrevious() {
        return this.showPrevious;
    }

    /**
     * 设置 是否有向前按钮
     *
     * @param showPrevious 是否有向前按钮
     */
    public void setShowPrevious(boolean showPrevious) {
        this.showPrevious = showPrevious;
    }

    /**
     * 获取 是否有第一页按钮
     *
     * @return showFirstPage 是否有第一页按钮
     */
    public boolean showFirstPage() {
        return this.showFirstPage;
    }

    /**
     * 设置 是否有第一页按钮
     *
     * @param showFirstPage 是否有第一页按钮
     */
    public void setShowFirstPage(boolean showFirstPage) {
        this.showFirstPage = showFirstPage;
    }

    /**
     * 获取 是否有下一页的按钮
     *
     * @return showNext 是否有下一页的按钮
     */
    public boolean getShowNext() {
        return this.showNext;
    }

    /**
     * 设置 是否有下一页的按钮
     *
     * @param showNext 是否有下一页的按钮
     */
    public void setShowNext(boolean showNext) {
        this.showNext = showNext;
    }

    /**
     * 获取 是否有最后一页的按钮
     *
     * @return ShowEndPage 是否有最后一页的按钮
     */
    public boolean showEndPage() {
        return this.showEndPage;
    }

    /**
     * 设置 是否有最后一页的按钮
     *
     * @param showEndPage 是否有最后一页的按钮
     */
    public void setShowEndPage(boolean showEndPage) {
        this.showEndPage = showEndPage;
    }

    /**
     * 获取 当前页
     *
     * @return page 当前页
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * 设置 当前页
     *
     * @param page 当前页
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取 当前的数组
     *
     * @return pages 当前的数组
     */
    public List<Integer> getPages() {
        return this.pages;
    }

    /**
     * 设置 当前的数组
     *
     * @param pages 当前的数组
     */
    public void setPages(List<Integer> pages) {
        this.pages = pages;
    }

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        Integer totalPage;
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }
        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(page - i,0);
            }
            if (page + i <= totalCount) {
                pages.add(page + 1);
            }
        }

        // 是否展示上一页
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }

        // 是否展示下一页
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }

        // 是否展示第一页
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        // 是否展示最后一页
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
