
package com.pg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.pg.bean.UserModel;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 23buliuhu
 * @version [版本号, 2016年5月17日]
 */
public class HelloWorldController extends AbstractCommandController
{

    public HelloWorldController()
    {
        setCommandClass(UserModel.class);
    }

    @Override
    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
            throws Exception
    {
        // 将命令对象转换为实际类型
        UserModel user = (UserModel)command;
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("user",user);
        return mv;
    }

}