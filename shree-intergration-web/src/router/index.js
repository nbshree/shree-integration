import Vue from 'vue';
import VueRouter from 'vue-router';
// import page403 from '@/views/errorPage/403';
// import _import from '@/utils/import';

// const Layout = _import('layout/index');

Vue.use(VueRouter);

export const constantRouterMap = [
    // {
    //   path: '/redirect',
    //   component: Layout,
    //   hidden: true,
    //   children: [
    //     {
    //       path: '/redirect/:path*',
    //       component: _import('redirect/index')
    //     }
    //   ]
    // },
    {
        path: '/403',
        component: () => import('@/views/errorPage/403'),
        hidden: true
    },
    {
        path: '/404',
        component: () => import('@/views/errorPage/404'),
        hidden: true
    },
    {
        path: '/500',
        component: () => import('@/views/errorPage/500'),
        hidden: true
    },
    {
        path: '/projectList',
        component: () => import('@/views/project/projectList'),
        hidden: true
    },
    {
        path: '/iconTest',
        component: () => import('@/views/testView/iconTest'),
        hidden: true
    },
    {
        path: '/test1',
        component: () => import('@/views/testView/test1'),
        hidden: true,
        children: [
            {
                path: "",
                // component:() => import('@/views/testView/test2')
                components: {
                    test1: () => import('@/views/testView/test2'),
                    default: () => import('@/views/testView/test1'), //默认省略不写name的情况
                }
            }
        ]
    },
    // {
    //   path: '/lock',
    //   component: _import('lock/index'),
    //   name: 'lock',
    //   hidden: true
    // },
    // {
    //   path: '',
    //   component: Layout,
    //   redirect: 'dashboard',
    //   single: true,
    //   children: [
    //     {
    //       path: 'dashboard',
    //       name: 'dashboard',
    //       component: _import('dashboard/index'),
    //       meta: {
    //         title: '控制面板',
    //         icon: 'dashboard',
    //         permission: 'dashboard'
    //       }
    //     }
    //   ]
    // }
];

const createRouter = () =>
    new VueRouter({
        // mode: 'history', // require service support
        // scrollBehavior: () => ({ y: 0 }),
        routes: constantRouterMap
    });

const router = createRouter();
//
// export function resetRouter () {
//   const newRouter = createRouter()
//   router.matcher = newRouter.matcher // reset router
// }

export default router;
