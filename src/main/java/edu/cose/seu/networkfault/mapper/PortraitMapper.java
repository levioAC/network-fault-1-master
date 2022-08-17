package edu.cose.seu.networkfault.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cose.seu.networkfault.model.Portrait;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PortraitMapper extends BaseMapper<Portrait> {
}
