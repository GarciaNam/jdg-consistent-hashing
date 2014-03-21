Consistent Hashing Algorithm Demo
=================================

Infinispan Webinar - Consistent Hashing Algorithm을 설명하기 위한 간단한 샘플 코드

* Consistent Hashing 알고리즘 샘플 

알고리즘의 동작 방식을 테스트하기 위한 샘플 코드입니다.
Hash함수는 제일 간단한 MD5 Hash를 사용하여 구현하였습니다.

TestConsistentHash.java 예제에서는 임의의 서버를 3개 등록한 후, 
임의의 KEY로 해당 KEY가 저장될 서버를 찾아내는 것으로 구성되어 있습니다.

server2를 삭제 후에도 다른 KEY들은 동일한 서버로 분배되고, server2에 할당되었던 
KEY들만 server1, server3으로 KEY가 분산되는 것을 확인 할 수 있습니다.

다음이 실행 결과입니다.
```
*** Hash Initialized.
=====================================
>> get akdlfajslkfd1 = server1
>> get dfjgkldfasdf2 = server1
>> get sakdjflkassa3 = server2
>> get zkldjlkzsdfs4 = server3
>> get dfjsgklsjfgk5 = server3
>> get sdklfjxlksdf6 = server2
>> get xdljsfspxfgs7 = server2
>> get erjtdxiddddf8 = server1
>> get wertwxsdkfdj9 = server2
=====================================
*** server2 removed.
=====================================
>> get akdlfajslkfd1 = server1
>> get dfjgkldfasdf2 = server1
>> get sakdjflkassa3 = server3
>> get zkldjlkzsdfs4 = server3
>> get dfjsgklsjfgk5 = server3
>> get sdklfjxlksdf6 = server3
>> get xdljsfspxfgs7 = server1
>> get erjtdxiddddf8 = server1
>> get wertwxsdkfdj9 = server3
=====================================
```


* Source Github 
https://github.com/nameislocus/jdg-consistent-hashing

* Opennaru, Inc.
http://www.opennaru.com/
http://opennaru.blog.me/
http://opennaru.tistory.com/