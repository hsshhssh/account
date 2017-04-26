package org.hssh.biz.controller;

import org.hssh.biz.entity.External;
import org.hssh.biz.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hssh on 2017/4/23.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    /**
     * 主账号注册：插入主账号记录、插入关联表记录 和 其他信息（余额）
     * @param phone
     * @return
     */
    @RequestMapping(value = "/master/register", method = RequestMethod.POST)
    public int masterRegister(@RequestParam("phone")  String phone) {
        return 0;
    }


    /**
     * 外部账号系统注册：插入主账号记录、插入外部账号记录、插入关联表 和其他信息（余额）
     * @param external
     * @return
     */
    @RequestMapping(value = "/external/register", method = RequestMethod.POST)
    public int thirdRegister(@RequestParam("external")  External external) {
        return 0;
    }

    /**
     * 外部系统账号绑定主账号：
     *  手机号已注册，更新关联表数据
     *  手机号未注册，先注册账号，更新关联数据
     * @param phone
     * @param external
     * @return
     */
    @RequestMapping(value = "/bind")
    public int bind(@RequestParam("phone") String phone, @RequestParam("external") External external) {
        return 0;
    }

    /**
     * 取得关联账号信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/associate/list")
    public List<User> getAssociateList(@RequestParam("id") int id) {
        return null;
    }

}
