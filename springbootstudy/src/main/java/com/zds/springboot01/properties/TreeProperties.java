package com.zds.springboot01.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 仅用于验证user.properties配置文件中数据自动绑定到类的功能,这只是ConfigurationProperties的一种用法
 *
 * *@PropertySource:指定自定义配置文件在Spring启动时加载到容器中
 * *@ConfigurationProperties:指定配置文件中的前缀，并将配置文件中匹配的属性封装到类属性上
 * encoding = "UTF-8" 解决中文乱码问题，因为配置文件为UTF-8
 */
@Component
@PropertySource(value = {"classpath:tree.properties"}, encoding = "UTF-8")
@ConfigurationProperties(prefix = "tree")
public class TreeProperties {
    private Integer treeId;

    private String treeName;

    private String url;

    private String sex;

    public Integer getTreeId() {
        return treeId;
    }

    public void setTreeId(Integer treeId) {
        this.treeId = treeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TreeProperties{" +
                "treeId=" + treeId +
                ", treeName='" + treeName + '\'' +
                ", url='" + url + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
