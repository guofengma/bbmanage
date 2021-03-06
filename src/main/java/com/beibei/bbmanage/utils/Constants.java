package com.beibei.bbmanage.utils;

public class Constants {

    //七牛配置所需要的
    public static class qiNiuTypeKey {
        public static final String ACCESS_KEY = "m2Zn29OXcy8nN_5yOXhsvDxE69StCWGaEBQk_oZV";
        public static final String SECRET_KEY = "68zxW_4cfbcyWAbuN9S9j09l_uJ0PH0DGMZwbciv";
        public static final String BUCKET_NAME = "bbcloud";
        public static final String PICTURE_URL = "http://pispn94t7.bkt.clouddn.com/";
    }

    //Web路径地址
    public static class webPageName {
        public static final String MANAGER_INDEX = "common/index";//首页
        public static final String MANAGER_WELCOME = "common/welcome";//首页欢迎页
        public static final String MANAGER_PAGE_ROTATION = "management/homepage/page-rotation";//商品轮播图
        public static final String MANAGER_PAGE_ROTATION_ADD = "management/homepage/page-rotation-add";//商品轮播图添加
        public static final String MANAGER_PAGE_PANEL = "management/homepage/page-panel";//商品板块内容
        public static final String MANAGER_PAGE_PANEL_ADD = "management/homepage/page-panel-add";//商品板块内容添加
        public static final String MANAGER_PICTURE_SHOW = "common/picture-show";//图片展示页面
        public static final String MANAGER_CAMPUS_INFO = "management/contentplate/campus-info";//园所信息列表
        public static final String MANAGER_GARTEN_ADD = "management/contentplate/garten-add";//园所添加页面
        public static final String MANAGER_ONLINE_BOOKCLASS = "management/contentplate/online-bookClasses";//在线预约课程
        public static final String MANAGER_ANNOUNCEMENT = "management/contentplate/announcement";//通知公告
        public static final String MANAGER_ANNOUNCEMENT_ADD = "management/contentplate/announcement-add";//通知公告添加
        public static final String MANAGER_TEACHERS = "management/contentplate/teachers";//师生列表展示
        public static final String MANAGER_TEACHERS_ADD = "management/contentplate/teacher-add";//老师信息添加
        public static final String MANAGER_STUDENT_ADD = "management/contentplate/student-add";//学生信息添加
        public static final String MANAGER_STUDENT_IMPORT = "management/contentplate/student-import";//学生导入
        public static final String MANAGER_FARM_RECIPES = "management/contentplate/farm-recipes";//园所食谱列表
        public static final String MANAGER_FARM_RECIPES_ADD = "management/contentplate/farm-recipes-add";//添加园所食谱
        public static final String MANAGER_BABY_SHOW = "management/contentplate/baby-show";//宝贝视频列表表
        public static final String MANAGER_BABY_SHOW_ADD = "management/contentplate/baby-show-add";//添加宝贝视频展示
        public static final String MANAGER_CLASS_PHOTO = "management/contentplate/class-photo";//班级相册展示
        public static final String MANAGER_CLASS_PHOTO_ADD = "management/contentplate/class-photo-add";//添加班级相册
        public static final String MANAGER_CLASS_PHOTO_SHOW = "management/contentplate/class-photo-show";//班级相册列表
        public static final String MANAGER_CLASS_PHOTOLIST_SHOW = "management/contentplate/class-photoList-show";//班级列表图片详情展示
        public static final String MANAGER_CLASS_LIST = "management/classes/class-list";//班级列表
        public static final String MANAGER_CLASS_ADD = "management/classes/class-add";//班级列表
        public static final String MANAGER_CLASS_LIST_SHOW = "management/classes/class-list-show";//班级列表table
        public static final String MANAGER_USER_LIST = "management/rootuser/user-list";//用户列表
        public static final String MANAGER_ACTIVITY_LIST = "management/contentplate/activity-list";//活动列表
        public static final String MANAGER_ACTIVITY_ADD = "management/contentplate/activity-add";//添加活动
        public static final String MANAGER_ACTIVITY_PHOTOTS = "management/contentplate/activity-photo-list";//活动相册列表
        public static final String MANAGER_ACTIVITY_PHOTOTS_ADD = "management/contentplate/activity-photo-add";//添加活动相册照片

    }

    //微信小程序配置所需要的
    public static class  wxPages{
        public static final String WX_API_URl = "https://api.weixin.qq.com/sns/jscode2session";//获取微信登陆的openId
        public static final String WX_APP_ID = "wxe04e81304960b5ef"; //小程序唯一标识符
        public static final String WX_APP_SECRET = "7faa0bb9cb0c560f5b797dd884b8d5f7"; //小程序的app srcret
        public static final String WX_APP_GRANTTYPE = "authorization_code"; //授权
        public static final String WX_APP_LOGIN_DATA = "wx_login_data";
    }

    public final static String HTML_BR = "<br/>";

}
