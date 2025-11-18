#!/bin/bash
# create_config_item.sh - 配置项创建脚本

PROJECT_CODE="GGAMS"
PHASE=$1
PRODUCT_TYPE=$2
MODULE=$3
VERSION=$4
DESCRIPTION=$5

CI_ID="${PROJECT_CODE}_${PHASE}_${PRODUCT_TYPE}_${MODULE}_${VERSION}"

echo "创建配置项: ${CI_ID}"
echo "描述: ${DESCRIPTION}"

# 创建配置项目录
mkdir -p "config-items/${CI_ID}"

# 创建配置项说明文档
cat > "config-items/${CI_ID}/README.md" << EOF
# 配置项文档: ${CI_ID}
# 描述: ${DESCRIPTION}
# 创建时间: $(date)
EOF

# 根据产品类型创建相应文件
case $PRODUCT_TYPE in
"SRS"|"HLD"|"LLD")
    # 文档类配置项
    touch "config-items/${CI_ID}/main.md"
    ;;
"CODE")
    # 代码类配置项
    mkdir -p "config-items/${CI_ID}/src"
    mkdir -p "config-items/${CI_ID}/tests"
    ;;
"TEST")
    # 测试类配置项
    touch "config-items/${CI_ID}/test_cases.md"
    touch "config-items/${CI_ID}/test_report.md"
    ;;
esac

echo "配置项 ${CI_ID} 创建完成"