package dao;

import pojo.Paper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Date:  2019/2/27.
 * Time:  20:42.
 * User:  zlcbs.
 */
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
