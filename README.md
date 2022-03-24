# what is this

codes for [atcoder](https://atcoder.jp/home)

# how to use

this repo uses following libs

- online-judge-tools
- atcoder-cli

login

```
oj login -u ${USERNAME} -p ${PASSWORD} "https://atcoder.jp/"
```

check login status

```
oj login --check "https://atcoder.jp/"
```

create repository for contest

```
acc new ${CONTEST_ID}
```

add a task

```
acc add
```

run

```
oj test -d ${TESTCASE_DIR} -c ${COMMAND}
```