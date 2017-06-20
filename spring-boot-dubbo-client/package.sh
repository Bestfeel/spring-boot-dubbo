#!/usr/bin/env bash




#打大包：
#mvn install assembly:assembly
#打包导出所有依赖

mvn clean  assembly:assembly   -Dmaven.test.skip=true