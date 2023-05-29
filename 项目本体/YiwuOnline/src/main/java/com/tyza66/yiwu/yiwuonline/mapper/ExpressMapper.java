package com.tyza66.yiwu.yiwuonline.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Express;
import org.apache.ibatis.annotations.Insert;

/**
 * Author: tyza66
 * Date: 2023/05/29 15:52
 * Github: https://github.com/tyza66
 **/
public interface ExpressMapper extends BaseMapper<Express> {
    @Insert("")
    public int addOneAndIdUp(Express express);
}
