package com.ghz.bean.repository.mg;

import com.ghz.bean.mg.KnifeData;
import com.ghz.bean.mg.KnifeDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnifeDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    long countByExample(KnifeDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int deleteByExample(KnifeDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int insert(KnifeData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int insertSelective(KnifeData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    List<KnifeData> selectByExample(KnifeDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    KnifeData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int updateByExampleSelective(@Param("record") KnifeData record, @Param("example") KnifeDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int updateByExample(@Param("record") KnifeData record, @Param("example") KnifeDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int updateByPrimaryKeySelective(KnifeData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knife_data
     *
     * @mbg.generated Thu May 21 11:12:11 CST 2020
     */
    int updateByPrimaryKey(KnifeData record);
}