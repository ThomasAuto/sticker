package cn.xiaoyanol.sticker.dao;

import cn.xiaoyanol.sticker.domain.Sticker;
import cn.xiaoyanol.sticker.domain.StickerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IStickerDAO {
    long countByExample(StickerExample example);

    int deleteByExample(StickerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sticker record);

    int insertSelective(Sticker record);

    List<Sticker> selectByExample(StickerExample example);

    Sticker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sticker record, @Param("example") StickerExample example);

    int updateByExample(@Param("record") Sticker record, @Param("example") StickerExample example);

    int updateByPrimaryKeySelective(Sticker record);

    int updateByPrimaryKey(Sticker record);
}