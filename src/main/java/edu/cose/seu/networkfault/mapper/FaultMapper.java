package edu.cose.seu.networkfault.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cose.seu.networkfault.model.Fault;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FaultMapper extends BaseMapper<Fault> {
}
