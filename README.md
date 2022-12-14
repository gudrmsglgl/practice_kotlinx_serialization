# practice_kotlinx_serialization
### main.kt 실행 결과
```shell
=======================Encode=======================
person: Person(name=david, age=31, sex=M, hobby=Game of League of Legends)
Encode process
json: {"name":"david","age":31,"sex":"M","hobby":"Game of League of Legends"}
====================================================

=======================Decode=======================
json: 
        {
            "name" : "david"
            "age" : 32
            "address" : "incheon"
        }
    
Decode process
person: Person(name=david, age=32, sex=M, hobby=Game of League of Legends)
====================================================
```


### advanced.kt 실행 결과
```shell 
expect type[VT001] 
JsonDecode type[VT001] 
JsonDecode classInfo > VT001(title=관심사 항목, data=[data1, data2, data3]) 

expect type[VT002] 
JsonDecode type[VT002] 
JsonDecode classInfo > VT002(title=이번주 키워드, keyword=재발집 막내 아들) 

expect type[VT002] 
JsonDecode type[VT003] 
JsonDecode classInfo > VT003(title=인기 콘텐츠, data=[연애참견, 재벌집 막내 아들, 종이의 집], views=200) 

```
