// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.eks;

import com.pulumi.aws.autoscaling.Group;
import com.pulumi.aws.ec2.SecurityGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.eks.NodeGroupV2Args;
import com.pulumi.eks.Utilities;
import java.util.List;
import javax.annotation.Nullable;

/**
 * NodeGroup is a component that wraps the AWS EC2 instances that provide compute capacity for an EKS cluster.
 * 
 */
@ResourceType(type="eks:index:NodeGroupV2")
public class NodeGroupV2 extends com.pulumi.resources.ComponentResource {
    /**
     * The AutoScalingGroup for the Node group.
     * 
     */
    @Export(name="autoScalingGroup", refs={Group.class}, tree="[0]")
    private Output<Group> autoScalingGroup;

    /**
     * @return The AutoScalingGroup for the Node group.
     * 
     */
    public Output<Group> autoScalingGroup() {
        return this.autoScalingGroup;
    }
    /**
     * The additional security groups for the node group that captures user-specific rules.
     * 
     */
    @Export(name="extraNodeSecurityGroups", refs={List.class,SecurityGroup.class}, tree="[0,1]")
    private Output<List<SecurityGroup>> extraNodeSecurityGroups;

    /**
     * @return The additional security groups for the node group that captures user-specific rules.
     * 
     */
    public Output<List<SecurityGroup>> extraNodeSecurityGroups() {
        return this.extraNodeSecurityGroups;
    }
    /**
     * The security group for the node group to communicate with the cluster.
     * 
     */
    @Export(name="nodeSecurityGroup", refs={SecurityGroup.class}, tree="[0]")
    private Output<SecurityGroup> nodeSecurityGroup;

    /**
     * @return The security group for the node group to communicate with the cluster.
     * 
     */
    public Output<SecurityGroup> nodeSecurityGroup() {
        return this.nodeSecurityGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeGroupV2(String name) {
        this(name, NodeGroupV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeGroupV2(String name, NodeGroupV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeGroupV2(String name, NodeGroupV2Args args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("eks:index:NodeGroupV2", name, args == null ? NodeGroupV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
