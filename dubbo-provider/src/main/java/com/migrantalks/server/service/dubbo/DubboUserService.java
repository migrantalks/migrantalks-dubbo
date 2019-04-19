package com.migrantalks.server.service.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.migrantalks.api.enums.StatusCode;
import com.migrantalks.api.response.Result;
import com.migrantalks.api.service.IUserService;
import com.migrantalks.model.entity.User;

import javax.ws.rs.Path;

/**
 * dubbo service
 * @author zgs
 * @date 2019/04/19
 */
@Service(protocol = {"dubbo","rest"},validation = "true",version = "1.0",timeout = 3000)
@Path("user")
public class DubboUserService implements IUserService {

    @Override
    @Path("/list")
    public Result findUser() {
        User user = new User();
        user.setAge(30);
        user.setName("zhongxia");

        Result result = new Result(StatusCode.Success);
        result.setData(user);

        return result;
    }
}
