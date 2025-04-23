FROM  lenacloud/lena-cluster:1.3.4.0-EN10-ubuntu22.04-jdk17-openjdk

ENV LENA_HOME /usr/local/lena
RUN mkdir -p $LENA_HOME
RUN mkdir -p $LENA_HOME/temp

#RUN apt-get update && apt-get install -y \
#    apache2-utils \
#    && rm -rf /var/lib/apt/lists/*
COPY ./ROOT.war $LENA_HOME/
RUN chmod u+x $LENA_HOME/*.sh

WORKDIR $LENA_HOME
CMD ["./docker-entrypoint.sh"]
