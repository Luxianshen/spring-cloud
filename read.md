springcloud  
  版本：2.1.3-RE  
  组件：  
      gateway  
      consul  
      config  
      fegin  
      hystrix  
      todo..  
   服务  
docker  
    consul:  
        创建挂在目录 mkdir -p /consul/data  
        启动指令  docker run -d -p 8500:8500 --restart=always --name=consuldev -v "/consul/data:/consul/data" consul agent -server -ui -client=0.0.0.0 -bootstrap-expect=1
   
      
      
