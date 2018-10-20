package cn.xiaoyanol.sticker.dao;

import cn.xiaoyanol.sticker.domain.Quota;
import cn.xiaoyanol.sticker.domain.QuotaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface IQuotaDAO {
    long countByExample(QuotaExample example);

    int deleteByExample(QuotaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Quota record);

    int insertSelective(Quota record);

    List<Quota> selectByExample(QuotaExample example);

    Quota selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Quota record, @Param("example") QuotaExample example);

    int updateByExample(@Param("record") Quota record, @Param("example") QuotaExample example);

    int updateByPrimaryKeySelective(Quota record);

    int updateByPrimaryKey(Quota record);
}