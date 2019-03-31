# AWS EC2 구성 및 nginx 설치
> 실서버 link <http://13.209.19.46>

<hr/>

## 1. AWS EC2 구성

- AMI 2018.03.0 (free tier) 선택

- inbound 설정 
    > 80(http) / 22(SSH) 사용할 ip만 추가

- 접속 명령어
    <pre><code>
    ssh -i {pemFile}@{ec2-user@public-address}
    </code></pre>

## 2. nginx 설치

- sudo yum install nginx (nginx 설치)

- 실행 관련 명령어
<pre><code>
    sudo service nginx start(시작)
    sudo service nginx stop(종료)
    sudo service nginx restart(재시작)
</code></pre>


