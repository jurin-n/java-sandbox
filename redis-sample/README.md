### project作成
```
mvn archetype:generate -DgroupId=com.jurin-n \
   -DartifactId=redis-sample \
   -DarchetypeArtifactId=maven-archetype-quickstart \
   -DinteractiveMode=false
```

### redisをdockerで起動
``` 
ls -a1 redis-data || mkdir redis-data
docker run -p 6379:6379 -v $PWD/redis-data:/data --name redis -d redis redis-server --appendonly yes
```