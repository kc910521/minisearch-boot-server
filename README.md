# minisearch-boot-server
mini-search in server,Powered by spring boot

本项目默认 context 名为： /mini_search
   
   范例接口地址： http://localhost:8080/mini_search/ms-cluster-service/find/treey/page/0/size/10?key=我  
   -------即为： http://localhost:8080/{工程名}    /{统一前缀}         /find/{索引名}/page/1/size/2?key=我
   
### 新增 

- save/{indexName}?key=?&value=?
    存储数据，key 为想被搜索到的内容，value为搜索到key之后返回的内容
    
- save/{indexName}/id/{id}?key=?&value=?
    同上，id为该条数据唯一ID
    
### 删除 

- remove/{indexName}?key=?
    key为想要删除的目标，也就是你搜索会找到的那个路径，key及当前key的value会被删除 
    
- remove/{indexName}/id/{id}?key=?
    同上，带上id做精准删除
    
### 查找 

- find/{indexName}?key=?
    搜索出指定key下的内容
    
- find/{indexName}/page/{page}/size/{pageSize}?key=?
    同上，page为页码，从零开始;pageSize为返回的条目。类似 LIMIT
    
### 初始化  
    
- init/{indexName} data=?
    传入json给data字段
    
