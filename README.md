# java虚拟机学习

JVM是java程序员必备的知识，无论是代码优化，扩展自身技术栈还是面试找工作，都是必不可少的。  
由于jvm记忆的东西比较多，以及可使用的工具较多。分为下面几个部分对其进行学习：

#### [1 指令记忆](#mem)
* #####  [1.1 内存分配](#mem.1)
* ##### [1.2 收集器参数设置](#mem.2)
#### 工具使用
#### 实战
#### [附录](#others)
* ##### [知识点回忆](#others.1)

- - -

## <a id = "mem">1. 指令记忆</a>

### <a id = "mem.1">1.1 内存分配</a>

* #### 内存溢出Dump出内存堆快照

        -XX:+HeapDumpOnOutOfMemoryError
        
* #### 输出日志参数
        
        -XX:+PrintGCDetails

* #### 堆内存控制

        设置堆最大为20M：-Xmx20m
        
        设置堆最小为20M：-Xms20m
        
        新生区大小8m：-Xmn8m
        
        对象超过16k直接进入老年代：-XX:PretenureSizeThreshold = 16k
        
        经过15次回收还存活进入老年代：-XX:MaxTenuringThreshold = 15
        
* #### 方法区内存

        内存上限10m：-XX：MaxPermSize = 10M
        
        内存下限制为8m：= 8M

* #### 栈内存

        设置栈内存为128k：-Xss128k
        
* #### 直接内存

        如果不指定大小，默认为堆最大值（-Xmx）
        
        指定为20m：-XX:MaxDirectMemorySize = 20M
        
### <a id = "mem.2">1.2 收集器参数设置</a>

* #### 设置Eden与Survivor之比
        
        8:1 ：-XX:SurvivorRatio = 8
        
* #### 指定ParNew + Serial Old

        -XX:+UseParNewGC
        
* #### ParNew + CMS + (备用老年代)Serial Old

        -XX:+UseConcMarkSweepGC
        
* #### 限制收集器线程数
        
        条数为2：-XX:ParallelGCThreads = 2
        
* #### 仅Parallel Scavenge生效参数
        
        回收的停顿时间100毫秒：-XX:MaxGCPauseMillis = 100
        
        回收时间/代码执行时间（1~99）：-XX:GCTimeRation = 10
        
        
* #### GC动态调节（新生代比例，进入老年代的规则等）

        -XX:+UseAdaptiveSizePolicy
        
 ### <a id = "others">附录</a>
* #### <a id = "others.1">知识点回忆</a>
>[jvm 虚拟机知识](https://www.zybuluo.com/Yano/note/321063#java-%E8%99%9A%E6%8B%9F%E6%9C%BA%E9%9D%A2%E8%AF%95%E9%A2%98%E5%85%A8%E9%9D%A2%E8%A7%A3%E6%9E%90)
