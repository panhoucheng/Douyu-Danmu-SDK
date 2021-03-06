# Douyu-Danmu-SDK

[![Build Status](https://travis-ci.org/panhoucheng/Douyu-Danmu-SDK.svg?branch=master)](https://travis-ci.org/panhoucheng/Douyu-Danmu-SDK)
[![Coverage Status](https://coveralls.io/repos/github/panhoucheng/Douyu-Danmu-SDK/badge.svg)](https://coveralls.io/github/panhoucheng/Douyu-Danmu-SDK)
[![License](https://img.shields.io/github/license/panhoucheng/Douyu-Danmu-SDK.svg)](https://raw.githubusercontent.com/panhoucheng/Douyu-Danmu-SDK/master/LICENSE)



### 介绍
项目使用 Maven + Java 开发 , 目前基于斗鱼公开的第三方接入API实现弹幕实时读取功能。


### 使用说明

1.目前支持监听的消息类型
  ```
  //斗鱼推送的原消息
  String

  //通用消息实体(用于处理所有接收到的消息)
  BaseMsg
  
  //错误消息/系统消息
  ErrorMsg
  
  //弹幕消息
  ChatMsg
  
  //赠送礼物消息
  DgbMsg
  
  //房间内用户抢红包消息
  GgbbMsg
  
  //礼物广播消息
  SpbcMsg
  
  //超级弹幕消息
  SsdMsg
  
  //用户进房通知消息
  UenterMsg
  ```

### TODO

1. 基于 Selenium + Chrome 实现自动登陆网页版斗鱼，并发送弹幕。
2. 实现 MongoDB Listener 持久化弹幕到数据库中用于后期分析。


### 参与贡献

1. Fork 本仓库
2. 基于develop分支创建新的 feature 分支
3. 提交代码
4. 新建 Pull Request

