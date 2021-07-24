package com.fuvidy.spring_cloud_demo_eureka_client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;

public class TestTreeNode {
    public static void main(String[] args) {
        TreeNode note1 = new TreeNode(1);
        TreeNode note2 = new TreeNode(2);
        TreeNode note3 = new TreeNode(3);
        TreeNode note4 = new TreeNode(4);
        TreeNode note5 = new TreeNode(5);
        note1.left = note2;
        note1.right = note3;
        note2.left = note4;
        note2.right = note5;

    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class  TreeNode{
        public Integer value;
        TreeNode left;
        TreeNode right;
        public TreeNode(Integer value){
            this.value = value;
        }
    }

}
