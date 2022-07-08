package com.itguigu.mybatis.mapper;

import com.itguigu.mybatis.pojo.Dept;
import com.itguigu.mybatis.pojo.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    Dept selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Fri Jul 08 13:53:40 CST 2022
     */
    int updateByPrimaryKey(Dept record);
}