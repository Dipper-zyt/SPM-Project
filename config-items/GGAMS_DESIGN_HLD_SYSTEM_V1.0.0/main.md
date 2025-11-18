# GGAMS 系统设计文档

## 1. 系统架构
### 1.1 总体架构
采用分层架构设计：
- 表现层：Web界面、移动端界面
- 业务逻辑层：Spring Boot服务
- 数据访问层：MyBatis框架
- 数据存储层：MySQL数据库

### 1.2 技术栈
- **后端**：Java + Spring Boot + MyBatis
- **前端**：Vue.js
- **数据库**：MySQL 8.0

## 2. 数据库设计
### 2.1 核心表结构
#### 物资表 (t_asset)
| 字段名 | 类型 | 说明 |
|--------|------|------|
| id | BIGINT | 主键 |
| asset_code | VARCHAR(50) | 物资编号 |
| asset_name | VARCHAR(100) | 物资名称 |
| asset_type | INT | 物资类型 |
| status | INT | 物资状态 |
| in_time | DATETIME | 入库时间 |
| create_time | DATETIME | 创建时间 |

#### 物资类型表 (t_asset_type)
| 字段名 | 类型 | 说明 |
|--------|------|------|
| type_id | INT | 类型ID |
| type_name | VARCHAR(50) | 类型名称 |
| type_code | VARCHAR(20) | 类型代码 |

## 3. 模块设计
### 3.1 物资管理模块
#### 3.1.1 类设计
- AssetService：物资业务服务类
- AssetController：物资REST接口
- AssetRepository：物资数据访问

#### 3.1.2 接口设计
- POST /api/asset/in - 物资入库
- GET /api/asset/{id} - 查询物资详情
- PUT /api/asset/transfer - 物资移交

### 3.2 系统管理模块
- UserService：用户管理
- RoleService：角色权限管理
- LogService：操作日志

## 4. 部署架构
### 4.1 环境规划
- 开发环境：本地开发
- 测试环境：内网测试服务器
- 生产环境：云服务器集群

创建时间：2025年11月17日
版本：V1.0.0