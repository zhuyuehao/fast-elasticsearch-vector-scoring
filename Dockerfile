# 定义基础镜像
FROM registry.cn-hangzhou.aliyuncs.com/leo625/elastic.elasticsearch:7.1.0

# 定义维护者信息
LABEL maintainer="zhu.yuehao@iwhalecloud.com"

# 设置容器时区为中国时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime


# 添加宿主机的应用 到容器中的指定目录
ADD target/releases/elasticsearch-binary-vector-scoring-7.1.0.tar /usr/share/elasticsearch/plugins/elasticsearch-binary-vector-scoring/


# 构建镜像命令
#docker build -t imagename:[tag] .
#docker build -t es-score:7.1.0 .


# 运行镜像命令
#docker run -it -p 8990:8990 \
#-v 宿主机目录/engine_face/config:/data/config \
#-v 宿主机目录/engine_face/logs:/data/logs \
#--name engine_face \
#leo625/engine_face:v1.0