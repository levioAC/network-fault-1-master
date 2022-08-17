package edu.cose.seu.networkfault.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cose.seu.networkfault.model.Statistics;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StatisticsMapper extends BaseMapper<Statistics> {
}
